$(function () {
	$("#province").change(function () {
		collegeOnchange()
	});
});
$(function () {
	$('[data-toggle="tooltip"]').tooltip();
});
function selectOnchange(obj) {
	//获取被选中的option标签选项
	$("#selectContent").empty();
	let value = obj.options[obj.selectedIndex].value;
	// alert(value);
	ajax_get("http://localhost:8080/HighSchool/getAllHighSchools",{},function (data) {
		var highSchoolObj = JSON.parse(data);
		for (var i = 0; i < highSchoolObj.length; i++) {
			if (value == highSchoolObj[i][middleschool_config.highschoolArea]) {
				$("#selectContent").append('<p style="font-size: 16px">' + highSchoolObj[i][middleschool_config.highschoolName] + '</p>');
			}
		}
	});
}

function overOnchange(obj) {
	let html = '<thead>\n' +
		'                            <tr>\n' +
		'                                <th style="text-align: center;">学校</th>\n' +
		'                                <th style="text-align: center;">2017分数</th>\n' +
		'                                <th style="text-align: center;">2018分数</th>\n' +
		'                                <th style="text-align: center;">2019分数</th>\n' +
		'                            </tr>\n' +
		'                            </thead>\n' +
		'                            <tbody id="overScoreTB"></tbody>';
	$("#overScoreList").empty().append(html);

	let value = obj.options[obj.selectedIndex].value;
	// console.log(value);
	ajax_get("http://localhost:8080/HighSchool/getDetailById",{"id":value}, function (data) {
		let overScObj = JSON.parse(data);
		$("#overScoreTB").append('<tr><td>'+ overScObj.highSchoolInfo.name +'</td><td>'+ overScObj.admissionInfos[0].score +
			'</td><td>'+ overScObj.admissionInfos[1].score +'</td><td>'+ overScObj.admissionInfos[2].score +'</td></tr>');
	});
}

function collegeOnchange() {
	// 清空table
	let html = '<thead>\n' +
		'                            <tr>\n' +
		'                                <th style="text-align: center;">学校</th>\n' +
		'                                <th style="text-align: center;">类型</th>\n' +
		'                                <th style="text-align: center;">2017分数</th>\n' +
		'                                <th style="text-align: center;">2018分数</th>\n' +
		'                                <th style="text-align: center;">2019分数</th>\n' +
		'                                <th style="text-align: center;">简介</th>\n' +
		'                            </tr>\n' +
		'                            </thead>\n' +
		'                            <tbody id="collegeContentT"></tbody>';
	$("#collegeContent").empty().append(html);


	// college_info = obj.options[obj.selectedIndex].value;
	ajax_get("http://localhost:8080/College/listByQuery",{},function (data) {
		let value1 = $("#province").val();
		let collegeObj = JSON.parse(data);
		for (let i = 0; i < collegeObj.length; i++) {
			// console.log(collegeObj[0].collegeInfo.area);
			if (value1 == collegeObj[i].collegeInfo.area) {
				let button = '<button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="left" title="'+ collegeObj[i].collegeInfo.description +'">查看</button>';
				let type = "|";
				if(collegeObj[i].collegeInfo.isArt == true){
					type += "艺术|";
				}if(collegeObj[i].collegeInfo.isDoubleFirst == true) {
					type += "双一流|";
				}if(collegeObj[i].collegeInfo.isKey == true) {
					type += "重点|";
				}if(collegeObj[i].collegeInfo.isUndergraduate == true) {
					type += "本科|";
				}else {
					type += "专科|";
				}

				// console.log(collegeObj[i].collegeInfo.name);
				$("#collegeContentT").append('' +
					'<tr><td><' +
					'a href="' + collegeObj[i].collegeInfo.url + '">' + collegeObj[i].collegeInfo.name + '</a>' +
					'</td><td>'+type+'</td><td>' +
					collegeObj[i].admissionInfos[0].score + '</td><td>' + collegeObj[i].admissionInfos[1]
					.score + '</td><td>' + collegeObj[i].admissionInfos[2].score + '</td><td>'+ button +'</td></tr>');
			}
		}
	});
}

function titleOnchange(obj) {
	let html = '<div id="titleCon" style="text-align: center;">\n' +
		'                        <h1 id="titleH"></h1>\n' +
		'                    </div>\n' +
		'                    <div id="contentCon" style="margin: 0 auto; margin-top: 20px; width: 70%;">\n' +
		'                        <p id="timeP" style="align-content: center"></p>\n' +
		'                        <p id="contentP"></p>\n' +
		'                    </div>\n' +
		'                    <div id="downLoadCon" style="margin-left: 20px; padding-top: 30%">\n' +
		'                        <span class="glyphicon glyphicon-download-alt" aria-hidden="true"><a id="downLoadA"></a></span>\n' +
		'                    </div>';
	$("#fileContent").empty().append(html);
	let value = obj.options[obj.selectedIndex].value;
	ajax_get("http://localhost:8080/getSuperiorFilesById",{"id": value}, function (data) {
		let annountObj = JSON.parse(data);
		let url = 'http://localhost:8080/' + annountObj[middleschool_config.url];
		// 时间戳转化为标准时间
		let myDate = annountObj[middleschool_config.time];
		let d = new Date(myDate);
		let pTime = (d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

		$("#titleH").text(annountObj[middleschool_config.title]);
		$("#timeP").text('时间： '+pTime);
		$("#contentP").text(annountObj[middleschool_config.content]);
		$("#downLoadA").text(annountObj[middleschool_config.fileName]);
		$("#downLoadA").attr("href", url);
	});
}

